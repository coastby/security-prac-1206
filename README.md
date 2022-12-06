## Spring Boot Security 연습
Dec 6, 2022

| METHOD   | API | desc                                                      |
|----------|---|-----------------------------------------------------------|
| **POST** | /api/v1/login| 로그인하면 token이 발급된다.                                        |
| **POST** | /api/v1/reviews | - token을 확인하고 없거나 유효하지 않으면 block 한다 <br/> - 유효하면 호출 성공한다. |

