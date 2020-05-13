Feature: Reset functionality on login page of Application				

Scenario Outline: Verification of reset button with numbers of credential

Given Open the Firefox and launch the application				

When Enter the Username <username>and Password <password> and logs in			

And close browsers					

Examples:                      		

|username                              |password         |		
|pavan2345@gmail.com                   |pabvc            |	
	    

