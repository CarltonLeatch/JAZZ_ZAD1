<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "calc" method = "post">
  <label>Kwota kredytu: <input type= "number" id = "kwota_kredytu" name= "kwota_kredytu" /></label></br>
  <label>Ilość rat: <input type ="number" id="ilosc_rat" name = "ilosc_rat"></label></br>
  <label>Oprocentowanie: <input type ="text" id="procent" name = "procent"></label></br>
  <label><input type ="radio" name="typ" value = "malejaca" checked>Malejąca</label></br>
  <label><input type ="radio" name="typ" value = "stala" >Stała</label></br>
  <input type = "submit" value ="wyślij" />
</form>
</body>
</html>