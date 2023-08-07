<%@ page contentType="text/html; charset=UTF-8" %>
<h1>회원가입</h1>
<form method="post">
    <dl>
        <dt>아이디</dt>
        <dd>
            <input type="text" name="userId">
        </dd>
    </dl>
    <dl>
        <dt>비밀번호</dt>
        <dd>
            <input type="password" name="userPw">
        </dd>
    </dl>
    <dl>
        <dt>비밀번호 확인</dt>
        <dd>
            <input type="password" name="userPwRe">
        </dd>
    </dl>
    <dl>
        <dt>회원명</dt>
        <dd>
            <input type="text" name="userNm">
        </dd>
    </dl>
    <dl>
        <dt>이메일</dt>
        <dd>
            <input type="text" name="email">
        </dd>
    </dl>
    <dl>
        <dt>휴대전화</dt>
        <dd>
            <input type="text" name="mobile">
        </dd>
    </dl>
    <dl>
        <dt>취미</dt>
        <dd>
            <input type="checkbox" name="hobby" value="야구">야구
            <input type="checkbox" name="hobby" value="축구">축구
            <input type="checkbox" name="hobby" value="농구">농구
            <input type="checkbox" name="hobby" value="피아노">피아노
            <input type="checkbox" name="hobby" value="독서">독서
        </dd>
    </dl>
    <dl>
        <dt>약관 동의</dt>
        <dd>
            <input type="checkbox" name="agree" value="true" id="agree">
            <label for="agree">가입 약관에 동의합니다.</label>
        </dd>
    </dl>
    <button type="submit">가입하기</button>
</form>