<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en-AU">
<head>
    <title>疏楼龙宿</title>
    <meta http-equiv="content-type" content="application/xhtml; charset=UTF-8" />
    <link href="${pageContext.request.contextPath}/styles/style.css" rel="stylesheet" type="text/css"  media="screen, tv, projection" />
</head>
<body>
    <div id="container">

        <div id="logo">
            <h1><span class="pink">miss</span>understood</h1>
        </div>

        <div id="search">
            <input type="text" size="15" /> <button>search</button>
        </div>

        <div class="br"></div>

        <div id="navlist">
            <ul>
                <li><a href="#" class="active">Home</a></li>
                <li><a href="#">Archives</a></li>
                <li><a href="#">Blog</a></li>
                <li><a href="http://www.willr.co.nz">My Site</a></li>
                <li><a href="http://www.oswd.org">OSWD</a></li>
                <li><a href="http://www.openwebdesign.org">OWD</a></li>
            </ul>
        </div>

        <div id="content">
            <h3>&rsaquo; Welcome</h3>
            <p>This is a version of my old site - <a href="http://www.willr.co.nz">willr.co.nz</a> but during the recent reboot the whole site got a good make over and a totally new design. So I had this xhtml/css design that I was just going to trash!! well I thought someone might find this useful so here it is for you to download and use free of charge.
                All I ask you keep the link in the footer to my site OR if you email me at <a href="mailto:will.rossiter@gmail.com">will.rossiter@gmail.com</a> and tell me your url you may remove the link and take full credit. I dont care :P.</p>
            <h3>&rsaquo; Styles</h3>
            <p>The code for this code box. It is a class called <code>.code</code></p>
            <div class="code">
                <pre>
                    #content .code{
                    color: #000000;
                    background: #F4f4f4 url(codenums.png) repeat-y;
                    border: 1px solid #ccc;
                    padding: 1px;
                    padding-left: 25px;
                    font-size: 1em;
                    width: 470px;
                    margin: 2px auto;
                    white-space: nowrap;
                    overflow: auto;}
                </pre>
            </div>

            <blockquote><p><span class="large">"</span>This is a blockquote. Be scared. Oh yes be very very scared</p></blockquote>

            <p>Well Thats all I can be bothered to do sorry. Other things in the stylesheet include <code>.left</code>/<code>.right</code>/<code>.center</code> So if you want an image to be right add <code>class="right"</code> to it and it will float right!! cool eh? nah not really.</p>
            <p>If you need any help with this <a href="http://www.willr.co.nz">contact me through my site</a> or ask one of the friendly folk around on the <a href="http://www.oswd.org">OSWD.org</a> or the <a href="http://www.openwebdesign.org">OWD.org</a> forums</p>

        </div>
        <div class="br"></div>
        <div id="footer">
            <p class="center">Copyright &copy; 2006 | <a href="#">XHTML</a> | <a href="#">CSS</a> | <a href="http://www.willr.co.nz">design by willr</a></p>
            <br />
        </div>
    </div>
</body>
</html>
