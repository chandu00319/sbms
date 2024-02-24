<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Information Form</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Student Information Form</h2>
        <form action="getdata" method="post">
            <div class="form-group">
                <label for="id">ID:</label>
                <input type="text" id="id" name="id" required>
      </div>
            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>