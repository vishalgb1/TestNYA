<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The New York Times</title>
<style>

body{
    text-shadow: 0 0 black;
    
    }

#logo{
	font-size: 25px;
	font-weight: bold;
	text-align:center;
}
#content{
    height: 500px;
    }

#nav ul{
	    padding-left: 0px;
		padding-top: 10px;
		padding-right: 10px;
		padding-bottom: 10px;
		
	}
	
#nav ul li{
		display: inline-block;
	}
	
#nav ul li a {
	    padding: 15px 75px 15px 75px;
	    background: #6288A5;
	    border-color: #4d7b9f;
	    color: white;
	    border-style: solid;
	    border-width: 1px;
	    font-size: 20px;
	    font-weight:bold;
}

#nav ul li a:hover{
	background-color:  #326891;
	border: 1px solid #326891;
	
	
}
</style>
</head>
<body>
<div id="page">
	<div id="logo">
			The New York Times
		</div>
		<div id="content">
		<div id="nav">
			<ul>
				<li><a href="NewYorkAppRedirection?value=world" target="resultframe"><span>World</span></a></li>
				<li><a href="NewYorkAppRedirection?value=politics" target="resultframe">Politics</a></li>
				<li><a href="NewYorkAppRedirection?value=business" target="resultframe">Business</a></li>
				<li><a href="NewYorkAppRedirection?value=science" target="resultframe">Science</a></li>
				<li><a href="NewYorkAppRedirection?value=health" target="resultframe">Health</a></li>
				<li><a href="NewYorkAppRedirection?value=sports" target="resultframe">Sports</a></li>
			</ul>	
		</div>
			<iframe src="https://www.nytimes.com/" width="100%" height="100%" name="resultframe">
				<p>Your browser does not support iframes.</p>
			</iframe>
		</div>
		
	</div>

</body>
</html>