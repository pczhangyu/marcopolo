--收集域名表
create sequence t_collect_targets_id_seq
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

create table public.t_collect_targets
(
	id integer default nextval('t_collect_targets_id_seq'::regclass) not null
		constraint t_collect_targets_pk
			primary key,
	domain varchar(64),
	interval varchar(40)
);