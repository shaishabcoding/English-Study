const id = e => document.getElementById(e);
window.onload = () => loadData();

function loadData() {
  var tem = ``;
  for (let i = 0; i < data.length; i++) {
    tem += `
    <div class="con">
      <table>
        <tr>
          <td>
            <div class="en">${data[i][0][0]}</div>
            <div class="bn">${data[i][0][1]}</div>
          </td>
          <td>
            <div class="en">${data[i][1][0]}</div>
            <div class="bn">${data[i][1][1]}</div>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <div class="en">${data[i][2][0]}</div>
            <div class="bn">${data[i][2][1]}</div>
          </td>
        </tr>
      </table>
    </div>
    `;
  }
  id("data").innerHTML = tem;
  console.log(tem);
  delete tem;
}
