<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <title>My First JSP Page</title>
</head>

<body>

<h3>Welcome, Enter The HBL Request Details</h3>
<form method="post" action="/hblpay/hblgateway/hblrequest/process/">
    Amount : <br><input type="number" required="true" name="amount" min="0"/> <br>
    Merchant Id : <br> <input type="text" required="true" name="merchantId" /><br>
    Currency Code : <br> <input type="text" required="true" name="currencyCode" /><br>
    Merchant KEY : <br><input type="text" required="true" name="merchantAccessKey" min="0"/> <br>
    Return URL : <br> <input type="text" required="true" name="returnUrl" /><br>
    Transaction ID : <br><input type="text" name="transactionId" min="0"/> <br>
    API Key : <br> <input type="text" name="apiKey" /><br>
    Remarks : <br><input type="text" name="remarks" min="0"/> <br>
    Bank Account Number : <br> <input type="text" name="bankAccountNumber" /><br>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>