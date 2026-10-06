<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Wine Form</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100">
    <div class="max-w-7xl mx-auto py-6 sm:px-6 lg:px-8">
        <h1 class="text-3xl font-bold underline">Add Wine</h1>
        <form action="wines" method="POST">
            <div class="mt-4">
                <label for="companyName" class="block text-sm font-medium text-gray-700">Company Name</label>
                <input type="text" name="companyName" id="companyName" class="mt-1 block w-full rounded-md border-gray-300 shadow-sm focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm" required>
            </div>
            <div class="mt-4">
                <label for="manfDate" class="block text-sm font-medium text-gray-700">Manufacture Date</label>
                <input type="date" name="manfDate" id="manfDate" class="mt-1 block w-full rounded-md border-gray-300 shadow-sm focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm" required>
            </div>
            <div class="mt-4">
                <label for="age" class="block text-sm font-medium text-gray-700">Age</label>
                <input type="number" name="age" id="age" class="mt-1 block w-full rounded-md border-gray-300 shadow-sm focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm" required>
            </div>
            <div class="mt-4">
                <label for="manfName" class="block text-sm font-medium text-gray-700">Manufacture Name</label>
                <input type="text" name="manfName" id="manfName" class="mt-1 block w-full rounded-md border-gray-300 shadow-sm focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm" required>
            </div>
            <div class="mt-4">
                <button type="submit" class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">
                    Add Wine
                </button>
            </div>
        </form>

        <c:if test="${not empty errors}">
            <ul>
                <c:forEach var="error" items="${errors}">
                    <li><c:out value="${error}" /></li>
                </c:forEach>
            </ul>
        </c:if>
        <c:if test="${not empty message}">
            <div class="bg-blue-100 border-t border-b border-blue-500 text-blue-700 px-4 py-3" role="alert">
                <p class="font-bold">${message}</p>
            </div>
        </c:if>
    </div>
</body>
</html>