-- 문제1 데이터베이스 생성
create database my_db;

-- 문제2 데이터베이스 목록 확인
show databases;

-- 문제3 데이터베이스 사용
use my_db;

-- 문제4 데이터베이스 삭제
drop database my_db;

-- 문제5 종합 실습
drop database if exists company_db;
create database company_db;
use company_db;
show databases;
