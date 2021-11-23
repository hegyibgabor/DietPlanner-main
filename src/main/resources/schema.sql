DROP TABLE IF EXISTS "breakfast";
CREATE TABLE IF NOT EXISTS "breakfast" (
                                           "ID"	INTEGER,
                                           "name"	TEXT,
                                           "calories"	INTEGER NOT NULL,
                                           "carbs"	INTEGER,
                                           "proteins"	INTEGER,
                                           "fats"	INTEGER,
                                           PRIMARY KEY("ID")
    );
DROP TABLE IF EXISTS "brunch";
CREATE TABLE IF NOT EXISTS "brunch" (
                                        "ID"	INTEGER,
                                        "name"	TEXT,
                                        "calories"	INTEGER NOT NULL,
                                        "carbs"	INTEGER,
                                        "proteins"	INTEGER,
                                        "fats"	INTEGER,
                                        PRIMARY KEY("ID")
    );
DROP TABLE IF EXISTS "lunch";
CREATE TABLE IF NOT EXISTS "lunch" (
                                       "ID"	INTEGER,
                                       "name"	TEXT,
                                       "calories"	INTEGER NOT NULL,
                                       "carbs"	INTEGER,
                                       "proteins"	INTEGER,
                                       "fats"	INTEGER,
                                       PRIMARY KEY("ID")
    );
DROP TABLE IF EXISTS "afternoon";
CREATE TABLE IF NOT EXISTS "afternoon" (
                                           "ID"	INTEGER,
                                           "name"	TEXT,
                                           "calories"	INTEGER NOT NULL,
                                           "carbs"	INTEGER,
                                           "proteins"	INTEGER,
                                           "fats"	INTEGER,
                                           PRIMARY KEY("ID")
    );
DROP TABLE IF EXISTS "dinner";
CREATE TABLE IF NOT EXISTS "dinner" (
                                        "ID"	INTEGER,
                                        "name"	TEXT,
                                        "calories"	INTEGER NOT NULL,
                                        "carbs"	INTEGER,
                                        "proteins"	INTEGER,
                                        "fats"	INTEGER,
                                        PRIMARY KEY("ID")
    );