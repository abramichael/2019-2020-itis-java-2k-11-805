<#macro content>
</#macro>

<#macro title></#macro>

<#macro main>
    <html>
    <head>
        <meta charset="UTF-8">
        <title><@title/></title>
    </head>
    <body>
        <h1>Our cool site</h1>
        <hr/>
        <@content/>
    </body>
    </html>
</#macro>