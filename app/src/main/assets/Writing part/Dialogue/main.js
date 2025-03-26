var table = document.getElementById("table");
for(let i=0;i<data.length;i++){
 table.innerHTML += `<tr ${i%2 != 0? 'class="even"':''}>
  <td>${i%2 == 0? men[0] : men[1]}</td>
  <td>${data[i]}</td>
 </tr>`;
}
document.getElementById("title").innerHTML = title;