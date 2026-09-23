<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cricket Team Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card shadow">
                    <div class="card-header bg-primary text-white">
                        <h4 class="mb-0">Cricket Team Form</h4>
                    </div>
                    <div class="card-body">
                        <form action="cricketTeam" method="get">
                            <div class="mb-3">
                                <label for="teamName" class="form-label">Team Name</label>
                                <input type="text" class="form-control" id="teamName" name="teamName" required>
                            </div>
                            <div class="mb-3">
                                <label for="captain" class="form-label">Captain</label>
                                <input type="text" class="form-control" id="captain" name="captain" required>
                            </div>
                            <div class="mb-3">
                                <label for="coach" class="form-label">Coach</label>
                                <input type="text" class="form-control" id="coach" name="coach">
                            </div>
                            <div class="mb-3">
                                <label for="country" class="form-label">Country</label>
                                <input type="text" class="form-control" id="country" name="country" required>
                            </div>
                            <div class="mb-3">
                                <label for="foundedYear" class="form-label">Founded Year</label>
                                <input type="text" class="form-control" id="foundedYear" name="foundedYear">
                            </div>
                            <div class="mb-3">
                                <label for="homeGround" class="form-label">Home Ground</label>
                                <input type="text" class="form-control" id="homeGround" name="homeGround">
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
