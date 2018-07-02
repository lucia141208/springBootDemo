<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
${hello}
<#if userList?? >

    <#list userList as user>
        ${user.id}-----${user.username}
        <hr />
    </#list>
</#if>

</body>
</html>