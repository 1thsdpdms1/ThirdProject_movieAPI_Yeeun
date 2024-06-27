🎬MovieAPI_GroupAirTeamProject2🎬

<div style="text-align: center;">

<br>
기존 2차 프로젝트였던 항공사 관리 페이지에 영화 오픈 API를 더해 보았습니다 <br>
컨셉과 잘 어우러지지 않아 새창열기로 다른공간으로 이동한 듯한 느낌을 주었고<br>
영화 컨셉에 맞는 컨셉과 로고를 디자인 하였습니다<br>
<br>
총 5개의 api를 사용하여 영화목록, 주간 박스오피스 순위, 일간 박스오피스 순위, 영화상세를 조회할수있으며<br>
영화 포스터가 나오게 하기위해 TMDB API를 사용하여 포스터 사진도 볼수있게 구현하였습니다<br>
<br>
이어 코모란 챗봇을 활용하여 형태소분석을 통해<br>
"주간"+"1등(순위)" 인식에 대한 답변으로 순위에 맞는 영화이름을 가져왔으며 이후<br>
"영화이름"+"정보" 통해 영화상세에 대한 답변으로 이어질수있도록 구현해보았습니다<br>
</div>

## 📌 목차

* [🔎프로젝트 소개](#프로젝트-소개)
  + [✔ 프로젝트 기본설정 ✔](#프로젝트-기본설정)
  + [✔ 기술스택 ✔](#프로젝트-기본설정)
  + [✔ 팀원소개 ✔](#Chatbot-구현)
  + [✔ 팀원소개 ✔](#팀원소개)
  + [✔ DB설계 ✔](#DB설계)
* [⭐프로젝트 시안](#프로젝트-시안)
  + [✔ 1. 로그인 페이지 구현 ✔](#-1-로그인-페이지-구현-)
  + [✔ 2. 회원등록 페이지 구현  ✔](#-2-회원등록-페이지-구현-)
  + [✔ 3. 회원관리 페이지 구현 ✔](#-3-회원관리-페이지-구현-)
  + [✔ NAVER API 연동 구현 ✔](#-4-naver-api-연동-구현-)


## ⚙프로젝트 소개

<details>
<summary>프로젝트 기본설정</summary>

|제목|내용|
|------|---|
|일정|2024/06/12~2024/06/026|
|인원|팀장 1명, 팀원 4명 (총 5인) _팀원으로 참여|
|프로젝트명| GroupAir TeamProject|
|프로그래밍 언어|JAVA|
|프레임워크|Springboot 2.7.11|
|데이터베이스|MySql8|
|개발툴| IntelliJ|
|템플릿 엔진|Thymeleaf (HTML + css)|
</details>

<details>
<summary> 기술스택 </summary>
<img src="https://img.shields.io/badge/javaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white">
<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot**&logoColor=white">
<img src="https://img.shields.io/badge/springsecurity-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white">
<img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white">
<img src="https://img.shields.io/badge/css3-1572B6?style=for-the-badge&logo=css3&logoColor=white">
<img src="https://img.shields.io/badge/thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white">
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/amazonwebservices-232F3E?style=for-the-badge&logo=amazonwebservices&logoColor=white">
<img src="https://img.shields.io/badge/amazonrds-527FFF?style=for-the-badge&logo=amazonrds&logoColor=white">
<img src="https://img.shields.io/badge/amazons3-569A31?style=for-the-badge&logo=amazons3&logoColor=white">
<img src="https://img.shields.io/badge/amazonecs-FF9900?style=for-the-badge&logo=amazonecs&logoColor=white">
<img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white">
<img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">



</details>

<details>
<summary> 팀원소개</summary>

<table>
  <tbody>
    <tr>
      <th align="center"><a href=""><img src="https://github.com/1thsdpdms1/FirstProject_ShopingMall_Yeeun/assets/154856610/e4f3a019-1688-4879-bf23-9e791e3b56a5" width="100px;" alt=""/><br /><sub><b>FE 팀장 : 손예은</b></sub></a><br /></th>
      <th align="center"><a href=""><img src="https://github.com/1thsdpdms1/FirstProject_ShopingMall_Yeeun/assets/154856610/a92bfe84-63f4-45b1-800c-4fc5c8512513" width="100px;" alt=""/><br /><sub><b>FE 팀원 : 서**</b></sub></a><br /></th>
      <th align="center"><a href=""><img src="https://github.com/1thsdpdms1/FirstProject_ShopingMall_Yeeun/assets/154856610/ea52beb1-8420-4f6b-9028-ff0f247dc895" width="100px;" alt=""/><br /><sub><b>FE 팀원 : 박** </b></sub></a><br /></th>
      <th align="center"><a href=""><img src="https://github.com/1thsdpdms1/FirstProject_ShopingMall_Yeeun/assets/154856610/becb61fa-7a36-43fc-a00c-aa20be5ec767" width="100px;" alt=""/><br /><sub><b>FE 팀원 : 정 **</b></sub></a><br /></th>
      <th align="center"><a href=""><img src="https://github.com/1thsdpdms1/FirstProject_ShopingMall_Yeeun/assets/154856610/c690bc9c-0d05-4067-a3d6-5ece66b61620" width="100px;" alt=""/><br /><sub><b>FE 팀원 : 조** </b></sub></a><br /></th>
</tr>
<tr>

<td> 영화 API, 챗봇</td>
<td> 영화 API, 챗봇 </td>
<td> 버스 API, 챗봇 </td>
<td> 버스 API, 챗봇 </td>
<td> 날씨 API, 챗봇</td>
</tr>
  </tbody>
</table>


</details>


<details>
<summary> 타임라인</summary>

![3차 일정](https://github.com/1thsdpdms1/ThirdProject_movieAPI_Yeeun/assets/154856610/23e1fd22-a07c-4b1a-9359-10b6f0076862)


</details>

<details>
<summary> DB설계 </summary>
  
![3차 DB](https://github.com/1thsdpdms1/ThirdProject_movieAPI_Yeeun/assets/154856610/5f8a6257-9cd4-4e61-9601-24384a3769ed)

</details>
<br>
<br>

## ⭐프로젝트 시안

![image](https://github.com/1thsdpdms1/ThirdProject_movieAPI_Yeeun/assets/154856610/c80b3154-74a5-4225-97ef-86ddee97b3cd)


### ✔ 1. 영화 오픈 API ✔
<details>
<summary>영화 오픈 API 시연 영상</summary>

https://github.com/1thsdpdms1/ThirdProject_movieAPI_Yeeun/assets/154856610/61bf9cc2-445b-47ac-987c-c00532da2cf0

https://github.com/1thsdpdms1/ThirdProject_movieAPI_Yeeun/assets/154856610/2c28304e-8c14-4df9-8f73-ccffae56d159

</details>

<details>
<summary> 영화 오픈 API 구현 시안 </summary>
  
<img src="https://github.com/1thsdpdms1/ThirdProject_movieAPI_Yeeun/assets/154856610/fcbf5eba-6e63-4a88-a0b4-e42a693d4595" width="700" height="400"/>

- 새창열기를 통해 다른공간으로 이동한듯한 느낌, css재구성
- 각종 순위르 확인할수있는 카테고리 버튼. 포스터/그리드 보기 방식버튼, 챗봇 , 이름클릭시 상세조회 모달창 구성

<img src="https://github.com/1thsdpdms1/ThirdProject_movieAPI_Yeeun/assets/154856610/754d797c-4bdd-4bf2-98ee-0fc96d0ded1b" width="700" height="400"/>

- 영화진흥원에서는 포스터를 제공하지 않으므로 TMDB 오픈 API를 사용
- 영화진흥원 데이터에서 영화제목과 개봉일을 사용하여 TMDB요청 주소를 완성
- ObjectMapper의 readTree()사용하여 JsonNode객체로 변환(-> 트리구조로 된 데이터에 접근하기 쉽기 때문)
- "poster_path" 필드의 값을 asText() 문자열로 변환하여 포스터 주소 완성
- 영화진흥원데이터와 Poster주소 합친 새로운 Entity를 사용
</details>
<br>
<br>

### ✔ 2. 영화 챗봇 구현 ✔
<details>
<summary>영화 챗봇 시연 영상</summary>


https://github.com/1thsdpdms1/ThirdProject_movieAPI_Yeeun/assets/154856610/6286cbf6-b529-4b56-b473-def31a167911


</details>

<details>
<summary>회원등록 구현 시안 </summary>

- 코모란을 통해 형태소 분석을 수행하여 분석 결과에 '주간'이 포함되어 있을 경우 특정 메서드를 호출하여 그에 대한 응답 데이터를 생성
- 2차 분석에서는 순위를 인식하도록하여, 최종적으로 주간과 순위를 인식하고 해당 데이터를 동적으로 불러오도록 설정
- 이때 사용자 정의 사전을 활용하여 순위도 명사로 인식하도록 설정하여 인식률을 높여주었습니다
- 바로 해당영화의 상세정보를 볼수있도록 버튼을 표시
- 이는 '정보'라는 토큰과 영화이름를 인식하여 해당 영화의 상세정보가 보이도록 구현

</details>
<br>
<br>

