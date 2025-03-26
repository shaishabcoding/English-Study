const id = e => document.getElementById(e);
window.onload = () => loadData();

function loadData() {
  var tem = ``;
  for (let i = 0; i < data.length; i++) {
    tem += `<div class="con">`;
    tem += `<div class="en">${data[i][0]}</div>`;
    tem += `<div class="bn">${data[i][1]}</div>`;
    tem += `</div>`;
  }
  id("data").innerHTML = tem;
  console.log(tem);
  delete tem;
}