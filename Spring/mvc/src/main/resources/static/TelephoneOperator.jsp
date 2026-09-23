<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Telephone Operator Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card shadow">
                    <div class="card-header bg-primary text-white">
                        <h4 class="mb-0">Telephone Operator Form</h4>
                    </div>
                    <div class="card-body">
                        <form action="telephoneOperator" method="get">
                            <div class="mb-3">
                                <label for="operatorName" class="form-label">Operator Name</label>
                                <input type="text" class="form-control" id="operatorName" name="operatorName" required>
                            </div>
                            <div class="mb-3">
                                <label for="countryCode" class="form-label">Country Code</label>
                                <input type="text" class="form-control" id="countryCode" name="countryCode" required>
                            </div>
                            <div class="mb-3">
                                <label for="networkType" class="form-label">Network Type</label>
                                <input type="text" class="form-control" id="networkType" name="networkType">
                            </div>
                            <div class="mb-3">
                                <label for="customerCare" class="form-label">Customer Care</label>
                                <input type="text" class="form-control" id="customerCare" name="customerCare">
                            </div>
                            <div class="mb-3">
                                <label for="plans" class="form-label">Plans</label>
                                <textarea class="form-control" id="plans" name="plans" rows="3"></textarea>
                            </div>
                            <div class="mb-3">
                                <label for="coverage" class="form-label">Coverage</label>
                                <input type="text" class="form-control" id="coverage" name="coverage">
                            </div>
                            <div class="d-grid gap-2">
                                <button type="submit" class="btn btn-primary">Submit</button>
                                <a href="Index.jsp" class="btn btn-secondary">Back</a>
                            </div>
                            ${message}
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
