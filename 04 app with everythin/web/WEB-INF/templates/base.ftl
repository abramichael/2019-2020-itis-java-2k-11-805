<#macro content></#macro>

<#macro display_page>
    <html>
    <head>
        <script type="application/javascript" src="/js/jquery-3.4.1.min.js"></script>
    </head>

    <body>

    <h1>Student book</h1>
    <a href="/list">List</a> | <a href="/new">New</a> | <a href="/search">Search</a>
    <hr/>
    <@content />
    <hr/>
    &copy; ITIS, 2019
    </body>
    </html>
</#macro>