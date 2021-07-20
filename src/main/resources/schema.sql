DROP TABLE IF EXISTS Board;

CREATE TABLE Board
(
    board_id        IDENTITY        PRIMARY KEY,
    board_title     VARCHAR(500)    NOT NULL,
    board_author    VARCHAR(255)    NOT NULL,
    board_contents  TEXT
);