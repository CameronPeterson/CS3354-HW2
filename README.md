# CS3354-HW2

First partial assignment for hw2.

Due date: October 17th by 11:59pm

Grade: 10% of the total grade (which is one third of the total 30% for hw2)

Implement Model part of MVC implementation in hw2.

The implementation must re-use the MVC related interfaces and classes from the Calculator
example described in the paper by John Hunt (referenced from the Midterm overview link
on the class website).
It's called acctMgrExIni.zip ; it's in folder CodeExamples/accountMgr

You can use the Eclipse project with the skeleton MVC code on TRACS in 


General requirements:

1. Implement Account class as a subclass of AbstractModel from MVC Calculator example
2. The initial Account class should have withdraw and deposit methods and balance, name, and ID attributes
3. Attribute balance should be implemented as BigDecimal 
4. Implement class AccountlList with methods for adding and removing an Account and methods to load and save an account list to a file
5. The file with accounts should have info for each account on a separate line: ID, name, balance
6. Implement JUnit test classes for classes Account and AccountList and a combined test class for both of them,
so there should be test classes AccountTest, AccountListTest and CombinedAccountTest
7. In those test classes there should be testcases for methods deposit, withdraw, add and remove account.
8. There should be a testcase that tests the OverdrawException thrown by withdraw method of Account class
9. JUnit test classes should be in a separate package "test"
10. There should be javadoc comments with generated html docs for methods of Account and AccountList classes

Grading guidelines:

0 if not submitted or submitted but nothing to run,, i.e. no test cases 
50% if AccountList not implemented at all (and it makes no sense to have AccountList without an Account class)
If no methods for loading and writing an account list: -20% 
If no javadoc comments, htmls: -10%  
If no combined test class -10% 
