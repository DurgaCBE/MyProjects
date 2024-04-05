<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./MCQ.css">
    
</head>
<body>
    
    <div class="start-screen">
        <h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Here we have 10 Java MCQ question <br><br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Total Mark:15 <br><br><br> <br></h2>
        <button id="start-button"> To Start Click Here</button>
    </div>
    <div id="display-container">
        <div class="header">
            <div class="number-of-count">
                <span class="number-of-question">1 of 3 questions</span>
            </div>
            <div class="timer-div">
                <img src="https://uxwing.com/wp-content/themes/uxwing/download/time-and-date/stopwatch-icon.png"
                    width="20px" />
                <span class="time-left">10s</span>
            </div>
        </div>
        <div id="container">
            <!-- questions and options will be displayed here -->
        </div>
        <button id="next-button">Next >></button>
    </div>
    <div class="score-container hide">
        <div id="user-score">Demo Score</div>
        <button id="restart">Restart</button>
    </div>
    <script src="script.js"></script>
</body>
</html>