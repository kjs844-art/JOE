# JIHOWE 역할 정리

이 폴더는 STS에서 실행하는 백엔드/JSP 프로젝트이다.

## 이 폴더에서 하는 일

- JSP 화면 구성
- Servlet, Controller, DAO, DTO 작성
- Oracle DB 연결
- Tomcat 실행 및 테스트

## 이 폴더에서 하지 않는 일

- 프론트 연습용 정적 파일 저장소처럼 사용
- `Front_Study` 전체 파일을 그대로 복사해서 섞기
- HTML 시안 폴더를 프로젝트 루트에 뒤섞기

## 연결 방식

- `Front_Study`에서 만든 정적 화면을 참고해서 JSP로 수동 반영한다.
- `JIHOWE`는 실제 동작 프로젝트이므로, URL/폼/세션/DB 흐름은 여기서만 관리한다.
- 즉 `Front_Study`는 디자인 참고용, `JIHOWE`는 실행용이다.

## 주요 구조

- `src/main/java`
  - Java 소스
- `src/main/webapp/WEB-INF/views`
  - JSP 화면
- `src/main/webapp/resource`
  - 실행용 정적 리소스

## 주의할 점

- `resource` 폴더는 웹 실행용 정적 리소스 위치이다.
- 이것은 `Front_Study`와 역할이 다르다.
- 같은 이미지나 CSS 개념이 있더라도 프로젝트 목적은 다르므로 폴더를 합치지 않는다.

## 작업 원칙

1. UI 시안 확인은 `Front_Study`에서 먼저 한다.
2. 실제 반영은 `JIHOWE`의 JSP와 Java 코드에서 따로 한다.
3. 프론트와 백엔드는 연결되어도 폴더 자체는 분리 유지한다.
4. 정적 시안 파일과 실행 프로젝트 파일을 한 폴더에 섞지 않는다.
