INSERT INTO region (latitude, longitude, name) VALUES
                                                   (1.1, 2.1, 'Pune'),
                                                   (3.1, 2.5, 'Mumbai');

INSERT INTO theatre (address, name, region_id) VALUES
                                                   ('3 Elpro Mall, Chinchwad', 'PVR', 1),
                                                   ('4, Malad West', 'Cinepolis', 2);

INSERT INTO screen (name, theatre_id) VALUES
                                          ('Screen 1', 1),
                                          ('Screen 2', 1),
                                          ('Screen 3', 1),
                                          ('Screen 1', 2);

INSERT INTO seat (col_num, row_num, seat_type, seat_number, screen_id) VALUES
                                                                           (1, 'A', 1, 12, 1),
                                                                           (1, 'C', 2, 19, 1),
                                                                           (3, 'D', 2, 20, 1);

INSERT INTO movies (duration, rating, category, language, name) VALUES
                                                                    (180, 4.0, 'DRAMA', 'HINDI', 'Ye Jawaani Hai Deewani'),
                                                                    (200, 5.0, 'ACTION', 'TELEGU', 'baahubali'),
                                                                    (190, 4.9, 'ACTION', 'ENGLISH', 'FAST X');

INSERT INTO movie_show (end_time, movie_id, screen_id, start_time) VALUES
                                                                       ('2024-12-11', 1, 1, '2024-12-10'),
                                                                       ('2024-12-11', 2, 1, '2024-12-11'),
                                                                       ('2024-12-11', 3, 2, '2024-12-11');

INSERT INTO show_seat (price, show_seat_status, seat_id, show_id) VALUES
                                                                      (100, 1, 1, 1),
                                                                      (120, 1, 2, 1),
                                                                      (140, 1, 3, 1),
                                                                      (140, 1, 1, 2);