insert into client (first_name, surname, phone_number, experience, age, driver_license, category_license, rating)
values ('Andrey', 'Nikolayev', '+791111119', 4, 43, true, 'AB', 4),
values ('Sasha', 'Nikolayev', '+791111118', 4, 43, true, 'ABD', 5),
values ('Yulya', 'Nikolayev', '+791111117', 4, 43, true, 'ABC', 1),
values ('Ekaterina', 'Nikolayev', '+791111116', 4, 43, true, 'A', 3),
values ('Natasha', 'Nikolayev', '+791111114', 4, 43, true, 'ABEF', 4);


insert into car (client_id, color, model, number)
values (1, 'red', 'PRIORA', '512HT05RU'),
values (2, 'green', 'BMW', '116HT05RU'),
values (3, 'black', 'MAZDA', '222HT05RU'),
values (4, 'blue', 'KALINA', '532HT05RU'),
values (5, 'purple', 'FORD', '764HT05RU');


insert into trip (client_id, car_id, trip_data, trip_duration)
values (1, 1, '2022-01-01', '05:00'),
values (1, 4, '2022-11-11', '08:00'),
values (2, 1, '2022-01-25', '01:00'),
values (3, 3, '2022-06-14', '02:00'),
values (4, 4, '2023-01-04', '06:00');
