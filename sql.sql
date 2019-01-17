DROP TABLE IF EXISTS reimbursement_request;
DROP TABLE IF EXISTS Management_user;
DROP TABLE IF EXISTS Employee_user;
DROP TABLE IF EXISTS Reimbursement;
DROP TABLE IF EXISTS Employee;
DROP TABLE IF EXISTS Management;


create table Management (
    Id serial primary Key,
    Name varchar(50) not Null,
    Location varchar(50) not Null,
    Phone_Number varchar(50) not Null,
    email varchar(150) not Null 
);
create table Employee (
    Id serial primary Key,
    Name varchar(50) not Null,
    Location varchar(50) not Null,
    Phone_Number varchar(50) not Null,
    email varchar(150) not Null 
);
create table Employee_user(
   Id serial primary Key not Null,
   Employee_id int references employee(id),
   username varchar(50) not Null,
   password varchar(50) not Null
);
create table Management_user(
    id Serial primary key not null,
    Management_id int references Management(id),
    username varchar(50) not Null,
   password varchar(50) not Null
    
);
create table reimbursement_request(
    id serial primary key,
    employee_id int references employee(id),
    manangement_id int references management(id),
    manangement_Approval varchar(50) not Null,
    title varchar(50) not Null,
    description varchar(550),
    amount real not Null,
    receipt BYTEA not Null
)