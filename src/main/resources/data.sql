insert into user(id, username, password, role)
values(100001, 'in28minutes', '$2a$10$AOEuSGnS/YExixnfYSGg3uz8pS8clSQr4C1/kxFrLIe7iZMPZ2UyK', 'ROLE_USER_2');

insert into time_record(id, username, date, task, start_time, duration)
values(10001, 'in28minutes', sysdate(), 'Write a report', '10:12', 7);

insert into time_record(id, username, date, task, start_time, duration)
values(10002, 'in28minutes', sysdate(), 'Learn JPA', '10:12', 2);

insert into time_record(id, username, date, task, start_time, duration)
values(10003, 'in28minutes', sysdate(), 'Estimate functionality', '10:12', 3);

insert into task(id, name, description)
values(20001, 'Write a report', 'The report concerning the bug fixing statistics during the current month');