# PaymentTracker
Test project for job application

#Assignment (shorten)
Payment Tracker
Write a program that keeps a record of payments. Each payment includes a currency and an amount. The program should output a list of all the currency and amounts to the console once per minute. The input can be typed into the command line, and optionally also be loaded from a file when starting up.

Sample input:
USD 1000   

HKD 100

USD -100

RMB 2000

HKD 200

Sample output:

USD 900

RMB 2000

HKD 300


Detailed requirements
When your Java program is run, a filename can be optionally specified. The format of the file will be one or more lines with Currency Code Amount like in the Sample Input above, where the currency may be any uppercase 3 letter code, such as USD, HKD, RMB, NZD, GBP etc. The user can then enter more lines into the console by typing a currency and amount and pressing enter. Once per minute, the output showing the net amounts of each currency should be displayed. If the net amount is 0, that currency should not be displayed.  When the user types "quit", the program should exit.


------------------------------------------------------------


#Assumptions
1. After user enters not valid file for loading the initial payment records there will be no more possibility to input it without program restart.
2. Values entered by user at the runtime do not affect the input file.
3. If initial file reading or access was not successful, there should be an option of manual input of paument records.
4. If user inputs quit even on the step of initial file name input, the program exits.

#Implementation details
 
 Implementation presents an interface `PaymentRecordRepository`  which has a common methods operating with PaymentRecords objects representing a domain object of payment record. This interface is implemented through a `PaymentRepositoryTableImpl` which presents an mplementation of payment records storage through Java `Hashtable` collection. As all the payment records are parsed (user input or text file) there is implemented a parser class `RecordParser` which handles both input parsing and records persisting through a reference object of repository instance. 
 
 As expected, all tracked records are written out once in a minute interval. Interface class `PaymentRecordWriter` which `extends Runnable` implements expected functionality. Implementation class `ConsolePaymentRecordWriter` contains a reference to an object implementing `PaymentRepositoryViewer ` interface which has an aim to narrow  `PaymentRecordRepository` API to only "viewing" getter methods.
 
    
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 