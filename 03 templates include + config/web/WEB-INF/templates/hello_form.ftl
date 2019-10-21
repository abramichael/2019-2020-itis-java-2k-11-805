<#include 'base.ftl'/>

<#macro title>Say hi to somebody</#macro>

<#macro content>
    <form action="/hello" method="get">
        <input type="text" name="name"/>
        <input type="submit" value="say hello"/>
    </form>
</#macro>

<@main/>