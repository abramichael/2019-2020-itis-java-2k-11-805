<#include "base.ftl"/>

<#macro title>hello, ${name}</#macro>

<#macro content>
    <#if name??>
        <#list greetings as g>
            <p>${g}, ${name}!</p>
        </#list>
    <#else>
        Hello, anonim!
    </#if>
</#macro>

<@main/>