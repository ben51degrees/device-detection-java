<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User-Agent Client Hints Example</title>
    <style>
        body {
            font-family: sans-serif;
            margin: 2em;
        }
    </style>
</head>
<body>

<h2>User Agent Client Hints Example</h2>
<p>
    By default, a UACH enabled browser sets the <code>user-agent</code>, <code>sec-ch-ua</code> and
    <code>sec-ch-ua-mobile</code> HTTP headers in a request to a server.
<p>
    This means that on the first request, the server can determine the
    browser from <code>sec-ch-ua</code> while other details must be derived from the
    <code>user-agent</code> header.
<p>
    If a server determines that the browser supports client hints, then
    it may request additional client hints headers by setting the
    <code>Accept-CH</code> header in a response.
<p>
    Select the <strong>Make another request</strong> button below,
    to get the browser to send another request to this server. This time, since the
    <code>Accept-CH</code> header was set in the first response (the one you are reading) any
    additional client hints headers that have been requested will be included in the next request.
<p>
    Since the browser will remember previous requests by the server to include UACH headers, the test
    needs to be carried out in a "private" window so that the next time the test is run the browser
    behaves as though it has not visited this site before.
<p>
    <button type="button" onclick="redirect()">Make another request</button>

    <script>
        // This script will run when button will be clicked and device detection request will again
        // be sent to the server with all additional client hints that was requested in the previous
        // response by the server.
        // Following sequence will be followed.
        // 1. User will send the first request to the web server for detection.
        // 2. Web Server will return the properties in response based on the headers sent in the request. Along
        // with the properties, it will also send a new header field Accept-CH in response indicating the additional
        // evidence it needs. It builds the new response header using SetHeader[Component name]Accept-CH properties
        // where Component Name is the name of the component for which properties are required.
        // 3. When "Make second request" button will be clicked, device detection request will again
        // be sent to the server with all additional client hints that was requested in the previous
        // response by the server.
        // 4. Web Server will return the properties based on the new User Agent Client Hint headers
        // being used as evidence.

        function redirect() {
            sessionStorage.reloadAfterPageLoad = true;
            window.location.reload(true);
        }

        window.onload = function () {
            if (sessionStorage.reloadAfterPageLoad) {
                document.getElementById('description').innerHTML = "<p>The information shown below is determined using <strong>User Agent Client Hints</strong> that was sent in the request to obtain additional evidence. If no additional information appears then it may indicate an external problem such as <strong>User Agent Client Hints</strong> being disabled in your browser.</p>";
                sessionStorage.reloadAfterPageLoad = false;
            } else {
                document.getElementById('description').innerHTML = "<p>The following values are determined by sever-side device detection on the first request.</p>";
            }
        }
    </script>

<div id="evidence">
    <br/>
    <strong>Evidence values used:</strong>
    <table>
        <tr>
            <th>Key</th>
            <th>Value</th>
        </tr>
        <c:forEach items="${evidenceUsed}" var="evidence">
            <tr>
                <td>${evidence['key']}</td>
                <td>${evidence['value']}</td>
            </tr>
        </c:forEach>
    </table>
</div>

<div id=description></div>
<div id="content">
    <p>
        <strong>Detection results:</strong><br/><br/>
        Hardware
        Vendor: ${hardwareVendor.hasValue() ? hardwareVendor.getValue() : "Unknown: ".concat(hardwareVendor.getNoValueMessage())}<br/>
        Hardware
        Name: ${hardwareName.hasValue() ? String.join(", ", hardwareName.getValue()) : "Unknown: ".concat(hardwareName.getNoValueMessage())}<br/>
        Device
        Type: ${deviceType.hasValue() ? deviceType.getValue() : "Unknown: ".concat(deviceType.getNoValueMessage())}<br/>
        Platform
        Vendor: ${platformVendor.hasValue() ? platformVendor.getValue() : "Unknown: ".concat(platformVendor.getNoValueMessage())}<br/>
        Platform
        Name: ${platformName.hasValue() ? platformName.getValue() : "Unknown: ".concat(platformName.getNoValueMessage())}<br/>
        Platform
        Version: ${platformVersion.hasValue() ? platformVersion.getValue() : "Unknown: ".concat(platformVersion.getNoValueMessage())}<br/>
        Browser
        Vendor: ${browserVendor.hasValue() ? browserVendor.getValue() : "Unknown: ".concat(browserVendor.getNoValueMessage())}<br/>
        Browser
        Name: ${browserName.hasValue() ? browserName.getValue() : "Unknown: ".concat(browserName.getNoValueMessage())}<br/>
        Browser
        Version: ${browserVersion.hasValue() ? browserVersion.getValue() : "Unknown: ".concat(browserVersion.getNoValueMessage())}
    </p>
</div>

</body>
</html>