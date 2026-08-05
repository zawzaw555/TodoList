# TodoList

Spring Boot と MyBatis を使ったシンプルな Todo 管理アプリです。  
Todo の一覧表示、追加、完了、削除をブラウザ画面から操作できます。また、登録済み Todo の一覧を JSON で取得する API も用意しています。

## 主な機能

- Todo の一覧表示
- Todo の新規追加
- Todo の完了状態への更新
- Todo の削除
- Todo 一覧の REST API 提供
- MySQL への Todo データ保存

## 使用技術

- Java 25
- Spring Boot 4.0.7
- Spring MVC
- Thymeleaf
- MyBatis
- MySQL
- Lombok
- Maven

## 画面

- |		URL		| 		内容				|
- |		---		| 		---				|
- | `/`			| `/todos` へリダイレクト	|
- |	`/todos`		| Todo 一覧画面			|
- |	`/todos/add`	| Todo 追加画面			|

## API

- | メソッド	|		URL			|			内容			|
- |	  ---	| 		--- 			|			---			|
- |  `GET`	| `/api/todo/list`	| Todo 一覧を JSON で取得	|

## セットアップ

### 1. リポジトリを取得

```bash
git clone <repository-url>
cd todo
```

### 2. MySQL にデータベースを作成

このアプリは `todo_db` というデータベースを使用します。

```sql
CREATE DATABASE todo_db CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
```

### 3. DB 接続設定を確認

`src/main/resources/application.properties` の接続情報を、自分の MySQL 環境に合わせて変更してください。

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Tokyo&characterEncoding=UTF-8
spring.datasource.username=root
spring.datasource.password=root
```

### 4. アプリを起動

```bash
./mvnw spring-boot:run
```

Windows の場合:

```bash
mvnw.cmd spring-boot:run
```

起動後、ブラウザで以下にアクセスします。

```text
http://localhost:8080/todos
```

## 初期データ

アプリ起動時に `src/main/resources/schema.sql` と `src/main/resources/data.sql` が実行されます。

- `schema.sql`: `todos` テーブルを作成
- `data.sql`: サンプル Todo を登録

現在の設定では `spring.sql.init.mode=always` のため、起動時にテーブルが再作成されます。登録済みデータを残したい場合は、設定や SQL の内容を変更してください。

## テーブル構成

- |		カラム		|	型			  | 内容		|
- |		-----		|	---			  | ---		|
- |		`id`			|	`BIGINT`		  | Todo ID	|
- |		`title`		|	`VARCHAR(100)` | タイトル	|
- |		`comment` 	|	`VARCHAR(500)` | コメント	|
- |		`todo_date`	|	`DATE`		  | 日付		|
- |		`completed`	|	`BOOLEAN`	  | 完了状態	|

## テスト

```bash
./mvnw test
```

## ディレクトリ構成

```text
src
├── main
│   ├── java/com/java/todo
│   │   ├── controllers
│   │   ├── models
│   │   ├── repositories
│   │   └── services
│   └── resources
│       ├── mappers
│       ├── static
│       ├── templates
│       ├── application.properties
│       ├── schema.sql
│       └── data.sql
└── test
```
