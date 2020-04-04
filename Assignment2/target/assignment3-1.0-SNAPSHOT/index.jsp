<html>
<body>
<div>
    <h1>SW QA Assignment 3 + 4!</h1>
    <p>Welcome to my completion of assignment 3 + 4. Created by Brandon Henry (bdh354). Please only use one calculator at a time.</p>
</div>
<div>
    <h2>BMI Calculator</h2>
    <p>To use the BMI calculator, please enter your height in feet and inches, as well as your weight below:</p>
    <form action="${pageContext.request.contextPath}/calculate" method="post">
        <label for="heightFeet">Height (Feet)</label>
        <input type="text" name="heightFeet" id="heightFeet" value="${heightFeet}">
        <label for="heightInches">Height (Inches)</label>
        <input type="text" name="heightInches" id="heightInches" value="${heightInches}">
        <label for="weight">Weight (Pounds)</label>
        <input type="text" name="weight" id="weight" value="${weight}">
        <input type="submit" name="calc" value="Calculate BMI">
    </form>
</div>
<hr>
<div>
    Results: ${bmi}
</div>
<br>
<div>
    <h2>Retirement Age Calculator</h2>
    <p>To use the retirement calculator, please enter your current age, salary, the percentage that you are saving, and your savings goal:</p>
    <form action="${pageContext.request.contextPath}/calculate" method="post">
        <label for="currentAge">Age</label>
        <input type="text" name="currentAge" id="currentAge" value="${currentAge}">
        <label for="salary">Salary</label>
        <input type="text" name="salary" id="salary" value="${salary}">
        <label for="percentSaved">Percent Saved</label>
        <input type="text" name="percentSaved" id="percentSaved" value="${percentSaved}">
        <label for="savingsGoal">Savings Goal</label>
        <input type="text" name="savingsGoal" id="savingsGoal" value="${savingsGoal}">
        <input type="submit" name="calc" value="Calculate Retirement Age">
    </form>
</div>
<hr>
<div>
    Results: ${retirement}
</div>
</body>
</html>
