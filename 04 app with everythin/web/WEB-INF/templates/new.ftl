<#include "base.ftl"/>

<#macro content>
    <form method="post" enctype="multipart/form-data">
        <p><input type="text" name="name"/></p>
        <p><input type="file" name="photo" /></p>
        <p><input type="submit" value="save"</p>
    </form>
</#macro>

<@display_page />