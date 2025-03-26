/*
 © Shaishab Chandra Shil
 17 Jan 2023 :: 8:21:36pm
*/
const getId = (id) => document.getElementById(id);
const setHtml = (element,html) => element.innerHTML = html;




setHtml(getId("long"),text);
setHtml(getId("short"),text.slice(0,text.length/5.445)+" ....");
setHtml(getId("title"),title);
setHtml(getId("ques"),"Read the following outlines and develop them into a complete story. Give a suitable title to it ᐅ")
setHtml(getId("board"),board);
