1. Where do the log()s end up?
A. Yes you're looking in the right places.
2. I'm getting a 405 HTTP method GET is not supported by this URL on the ApplicationStartup, but the directions say that only needs an init() method...
A. Don't actually run this class.
3. Am I sending the search form (employeeSearch.java ln 18) to the correct servlet? The directions say to set the action to EmployeeSearchServlet...
A. Yes, the EmployeeSearchServlet aka the EmployeeSearchResultsServlet is the correct place to send this form.
4. Is it ok that I use what is essentially a custom head tag on the employeeSearch.jsp so I can use internal styles rather than inline styles instead of using the c:import?
A. Probably.
5. I just have one big searching method in EmployeeDirectory.java for searching the database... I don't think this is correct, but it doesn't have lots of redundant code and I can't see how I should break it up...

6. By "validate input" in reference to the adding of an employee, is it meant to make all fields required or make it so people don't hack into your program?
A. At least require all, for bonus points, yes, do anti-sql-hacking input validation.

7. I have logs and printlns in all the places, and I still don't understand... ugh... Unless we need to pass the properties to the connecting to database method... that's my only idea... in which case why wasn't that in the directions?
Update: my idea doesn't work.
8. I don't understand what to work with or apply in terms of the post-form-submission-but-never-otherwise message. What I found on Google suggested that it may have to do with timing out a session... I feel like that is wrong though.
A. Yes that's wrong. See question 9.
9. I got the message to go away if you navigate to the homage page then to the first page again, but if you just go back and forward a page with the browser buttons, the message is still there. Does this count?

10. How do I get rid of the quotes around the column name without making it a little redundant?
A. You don't. It's gonna be a little redundant.
