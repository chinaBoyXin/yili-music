@echo off
set year=%Date:~0,4%
set month=%Date:~5,2%
set day=%Date:~8,2%
set hour=%Time:~0,2%
if %hour% LSS 10 (
  set hour=0%Time:~1,1%
)
set minutes=%Time:~3,2%
set sec=%Time:~6,2%
set nowDate=%year%%month%%day%%hour%%minutes%%sec%
set/p name=please input sql comment:
cd ../src/main/resources/db/migration
@echo off > V%nowDate%__%name%.sql