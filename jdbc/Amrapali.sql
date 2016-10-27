/*
show databases;
create database amrapali;
use amrapali;

*/



/*Guard's table*/

create table GUARDS (id int(5) primary key auto_increment, name varchar(20) not null, 
	age int(3) not null, salary int(7) not null, reporting_time time not null,
	 checkout_time time not null, joining_date date not null);

/*Resident complaints*/
create table Resident_Complaints (s_no int(5) primary key auto_increment, flat_no varchar(8) not null
	,name varchar(20) not null, Complaint varchar(100) not null, Complaint_date date not null, solved_or_not boolean);   


/*Maintanance*/	

create table Maintanance (s_no int(5) primary key auto_increment, flat_no varchar(8), bill_maintanance int(10), paid_or_not boolean);    



/*Electricity bill*/	
 create table elect_bill (s_no int(5) primary key auto_increment, flat_no varchar(8), bill_amount int(10), paid_or_not boolean);   


 /*Things Needed*/	

 create table things_needed (S_No int(4) primary key auto_increment, things_needed varchar(40));


 /*Things already have*/	
  create table things_already_have (S_No int(4) primary key auto_increment, things_already_have varchar(40));


/*areas which need maintanance*/

create table maintanance_area (S_No int(4) primary key auto_increment, name_of_area varchar(20));  


/*Occupied and unoccupied houses*/

create table houses (s_no int(5) primary key auto_increment, flat_no varchar(8), Occupied boolean);  /*add S.No. and owner's name*/  
   





/*populating data***********************************************************************************************************************/
/**************************************************************************************************************************************/

insert into GUARDS (name, age, salary, reporting_time, checkout_time, joining_date) values ("mohan", 32, 20000, now(), now(), now());
insert into GUARDS (name, age, salary, reporting_time, checkout_time, joining_date) values ("pappu", 29, 15000, now(), now(), now());




insert into Resident_Complaints (flat_no ,name, Complaint,Complaint_date, solved_or_not) values ("A-101", "Rohit", "dirty stairs",now(), false);	



insert into maintanance (flat_no, bill_maintanance, paid_or_not) values ("A-101",13000, true);



insert into elect_bill (flat_no, bill_amount, paid_or_not) values ("A-103", 2320, true);	



insert into things_needed (things_needed) values("nothing");	




insert into things_already_have (things_already_have) values ("everything");




insert into maintanance_area (name_of_area) values ("A- Block");


insert into houses (flat_no, Occupied) values ("A-101", true);
insert into houses (flat_no, Occupied) values ("A-102", true);
insert into houses (flat_no, Occupied) values ("A-103", true);









/*queries*/
select things_already_have.things_already_have, things_needed.things_needed from things_already_have
 join things_needed on things_already_have.s_no=things_needed.s_no;

 select * from (select things_already_have.things_already_have, things_needed.things_needed from things_already_have
 join things_needed on things_already_have.s_no=things_needed.s_no);