INSERT INTO tb_users (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_users (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_users (name, email, password) VALUES ('Victor Arruda', 'victor@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_roles (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_roles (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_roles (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('BootCamp Html.', 'image_test', 'image_gray_test');

INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2023-04-10T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-04-10T03:00:00Z', 1);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2023-04-10T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-04-10T03:00:00Z', 1);

INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Testing', TIMESTAMP WITH TIME ZONE '2023-04-10T12:30:00Z', 0, 'Testing', 1);

INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Trilha', 'Trilha Principal', 1, 'image_test', 2, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Forum', 'Testing', 2, 'image_test', 3, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Lives', 'Testing', 3, 'image_test', 1, 1);

INSERT INTO tb_section (title, description, img_Uri, position, resource_id, pre_requisite_id) VALUES ('Capítulo 01', 'Testing', 'image_test', 1, 1, null);
INSERT INTO tb_section (title, description, img_Uri, position, resource_id, pre_requisite_id) VALUES ('Capítulo 02', 'Testing', 'image_test', 1, 1, 1);
INSERT INTO tb_section (title, description, img_Uri, position, resource_id, pre_requisite_id) VALUES ('Capítulo 03', 'Testing', 'image_test', 1, 1, 2);

INSERT INTO tb_enrollment (user_id, offer_id, enroll_Moment, refund_Moment, available, only_Update) VALUES (1, 1, TIMESTAMP WITH TIME ZONE '2023-04-15T12:00:00Z', null, true, false);
INSERT INTO tb_enrollment (user_id, offer_id, enroll_Moment, refund_Moment, available, only_Update) VALUES (2, 1, TIMESTAMP WITH TIME ZONE '2023-04-20T12:00:00Z', null, true, false);

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 01', 1, 1);
INSERT INTO tb_content(id, text_content, video_uri) VALUES (1, 'testing...', 'testing...');

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 02', 1, 2);
INSERT INTO tb_content(id, text_content, video_uri) VALUES (2, 'testing...', 'testing...');

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 03', 1, 3);
INSERT INTO tb_content(id, text_content, video_uri) VALUES (3, 'testing...', 'testing...');

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Tarefa Cap.01', 1, 1);
INSERT INTO tb_task(id, description, question_count, approval_count, weight, due_date) VALUES (4, 'testing...', 5, 3, 1.0, TIMESTAMP WITH TIME ZONE '2023-04-25T12:00:00Z');

INSERT INTO tb_lessons_done(lesson_id, user_id, offer_id) VALUES (4, 1, 1);

INSERT INTO tb_deliver (uri, moment, status, feedback, correct_count, lesson_id, user_id, offer_id) VALUES ('Testing', TIMESTAMP WITH TIME ZONE '2023-04-25T12:00:00Z', 0, null, null, 4, 1, 1);