CREATE TABLE CustomerDetails(customer_id int, customer_name VARCHAR2(50) );

INSERT INTO CUSTOMER(customer_id ,customer_name) values (501,'Customer1');
INSERT INTO CUSTOMER(customer_id ,customer_name) values (502,'Customer2');
INSERT INTO CUSTOMER(customer_id ,customer_name) values (503,'Customer3');
INSERT INTO CUSTOMER(customer_id ,customer_name) values (504,'Customer3');
INSERT INTO CUSTOMER(customer_id ,customer_name) values (505,'Customer3');

CREATE TABLE RewardsProgram (Transaction_Id int,Cusotmer_Id int ,Rewards_date DATE,Trans_Amnt Double);

INSERT INTO TRANSACTION(Transaction_Id,Cusotmer_Id,Rewards_date,Trans_Amnt) VALUES (10001,501,'2020-04-12',120);
INSERT INTO TRANSACTION(Transaction_Id,Cusotmer_Id,Rewards_date,Trans_Amnt) VALUES (10002,503,'2020-04-12',120);
INSERT INTO TRANSACTION(Transaction_Id,Cusotmer_Id,Rewards_date,Trans_Amnt) VALUES (10003,502,'2020-04-12',120);
INSERT INTO TRANSACTION(Transaction_Id,Cusotmer_Id,Rewards_date,Trans_Amnt) VALUES (10004,501,'2020-04-12',120);
INSERT INTO TRANSACTION(Transaction_Id,Cusotmer_Id,Rewards_date,Trans_Amnt) VALUES (10005,504,'2020-04-12',120);
INSERT INTO TRANSACTION(Transaction_Id,Cusotmer_Id,Rewards_date,Trans_Amnt) VALUES (10006,502,'2020-04-12',120);
INSERT INTO TRANSACTION(Transaction_Id,Cusotmer_Id,Rewards_date,Trans_Amnt) VALUES (10007,503,'2020-04-12',120);
INSERT INTO TRANSACTION(Transaction_Id,Cusotmer_Id,Rewards_date,Trans_Amnt) VALUES (10008,502,'2020-04-12',120);
INSERT INTO TRANSACTION(Transaction_Id,Cusotmer_Id,Rewards_date,Trans_Amnt) VALUES (10009,505,'2020-04-12',120);
INSERT INTO TRANSACTION(Transaction_Id,Cusotmer_Id,Rewards_date,Trans_Amnt) VALUES (10010,501,'2020-04-12',120);
