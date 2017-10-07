## 첫 개인 프로젝트 서울시 착학가게 게시판
시작 2017-10-07

주제 : 서울시 공공 api 착학가격업소현황을 활용하여 착한가게 리스트를 보여준다. [착한가격 api 홈페이지](http://data.seoul.go.kr/openinf/openapiview.jsp?infId=OA-1173#detailInfo) 

몇 번 개인 프로젝트를 시도하였으나 시작을 너무 거창하게 하려고 세팅만 하다 흐지부지.... 일단 데이터를 가져오는 것 부터 시작하자.  
데이터 인터페이스 -> 게시판 -> 회원 등으로 확대해 나갈 예정  
그리고 하면서 알아가는 내용을 TIL에 정리하기

희망 활용 기술
1. spring boot
2. jpa
3. jooq
4. mongo db
5. vue.js
6. 마지막 배포는 aws에 해보자!!!

task
1. 프로젝트 셋팅
	- intellij spring boot 초기 세팅 
	- vue-cli 사용 vue init
2. 서울시 공공 api 데이터 가져오기
