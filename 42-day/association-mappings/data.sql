-- Insert statements for the Person table

INSERT INTO person (name, dob)
VALUES ('John Doe', '1990-01-01');

INSERT INTO person (name, dob)
VALUES ('Jane Smith', '1985-05-15');

INSERT INTO person (name, dob)
VALUES ('Bob Johnson', '1998-12-31');

INSERT INTO person (name, dob)
VALUES ('Alice Lee', '1992-07-10');

INSERT INTO person (name, dob)
VALUES ('David Kim', '1978-03-22');


-- Insert statements for the IdentityDoc table

INSERT INTO identity_doc (type, isActive, person_id)
VALUES ('Passport', true, 1);

INSERT INTO identity_doc (type, isActive, person_id)
VALUES ('Driver License', true, 2);

INSERT INTO identity_doc (type, isActive, person_id)
VALUES ('National ID', false, 3);

INSERT INTO identity_doc (type, isActive, person_id)
VALUES ('Passport', true, 4);

INSERT INTO identity_doc (type, isActive, person_id)
VALUES ('National ID', true, 5);


-- Insert statements for the ContactDetails table

INSERT INTO contact_details (mobile, email, person_id)
VALUES ('1234567890', 'john.doe@example.com', 1);

INSERT INTO contact_details (mobile, email, person_id)
VALUES ('5555555555', 'jane.smith@example.com', 2);

INSERT INTO contact_details (mobile, email, person_id)
VALUES ('9876543210', 'bob.johnson@example.com', 3);

INSERT INTO contact_details (mobile, email, person_id)
VALUES ('1112223333', 'alice.lee@example.com', 4);

INSERT INTO contact_details (mobile, email, person_id)
VALUES ('4445556666', 'david.kim@example.com', 5);
