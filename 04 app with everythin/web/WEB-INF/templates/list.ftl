<#include "base.ftl" />

<#macro content>
<table border="1">
    <#list students as s>
        <tr>
            <td>#${s.id}</td>
            <td>${s.name}</td>
            <!-- if null: a! -->
            <td><#if s.photoPath??>
                <img src="${s.photoPath!}" width="200"/> </td>
            </#if>

        </tr>
    </#list>
</table>
</#macro>

<@display_page />