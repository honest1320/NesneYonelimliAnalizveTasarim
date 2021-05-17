--
-- PostgreSQL database dump
--

-- Dumped from database version 13.1
-- Dumped by pg_dump version 13.1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: postgres; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA postgres;


ALTER SCHEMA postgres OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: users; Type: TABLE; Schema: postgres; Owner: postgres
--

CREATE TABLE postgres.users (
    user_name text NOT NULL,
    passcode text NOT NULL
);


ALTER TABLE postgres.users OWNER TO postgres;

--
-- Data for Name: users; Type: TABLE DATA; Schema: postgres; Owner: postgres
--

INSERT INTO postgres.users VALUES
	('honest', 'aaa'),
	('mark', 'bbb'),
	('feruz', 'ccc'),
	('fatih', 'ddd');


--
-- PostgreSQL database dump complete
--

