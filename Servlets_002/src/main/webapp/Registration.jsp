<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style type="text/css">
    /* Reset some default styles */
body, ul {
    margin: 0;
    padding: 0;
}

/* Basic styling for the navbar */
.navbar {
    display: flex;
    justify-content: space-between;
    align-items: center;
    background-color: #333;
    color: #fff;
    padding: 1rem;
}

.navbar-logo a {
    color: #fff;
    text-decoration: none;
    font-size: 1.5rem;
    font-weight: bold;
}

.navbar-menu {
    list-style: none;
    display: flex;
}

.navbar-menu li {
    margin-right: 1rem;
}

.navbar-menu a {
    text-decoration: none;
    color: #fff;
}

/* Navbar toggle button styles */
.navbar-toggle {
    display: none;
    flex-direction: column;
    cursor: pointer;
}

.navbar-toggle span {
    height: 3px;
    width: 25px;
    background-color: #fff;
    margin: 4px 0;
    transition: 0.4s;
}

/* Media query for responsiveness */
@media screen and (max-width: 768px) {
    .navbar-menu {
        display: none;
        flex-direction: column;
        background-color: #333;
        position: absolute;
        top: 70px;
        left: 0;
        right: 0;
    }

    .navbar-menu.active {
        display: flex;
    }

    .navbar-menu li {
        margin: 1rem 0;
    }

    .navbar-toggle {
        display: flex;
    }

    .navbar-toggle.active span:nth-child(1) {
        transform: rotate(-45deg) translate(-5px, 6px);
    }

    .navbar-toggle.active span:nth-child(2) {
        opacity: 0;
    }

    .navbar-toggle.active span:nth-child(3) {
        transform: rotate(45deg) translate(-5px, -6px);
    }
}
    
    
    
    
    </style>
 
</head>
<body>


    <nav class="navbar">
        <div class="navbar-logo">
            <a href="#">Your Logo</a>
        </div>
        <ul class="navbar-menu">
            <li><a href="#">Home</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Services</a></li>
            <li><a href="#">Contact</a></li>
        </ul>
        <div class="navbar-toggle">
            <span></span>
            <span></span>
            <span></span>
        </div>
    
    <script src="script.js"></script>

      
</body>
</html>