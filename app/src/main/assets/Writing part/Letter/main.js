/*
 © Shaishab Chandra Shil
 19 Jan 2023 :: 4:48:07pm
*/
const getId = (id) => document.getElementById(id);
const setHtml = (element, html) => element.innerHTML = html;

setHtml(getId("body"),`
  <p id="ques">${ques}</p>
  <br>
  <p id="heading">20 January 2023<br>Noakhali</p>
  <br>
  <p id="body">${body}</p>
  <br>
  <p id="signature">Your ever,<br>Shaishab Chandra Shil</p>
  <br>
  <table>
    <tr>
      <td>
        From
        <p id="formadd">Name: -<br>
                  Village: -<br>
                  Post - office: -<br>
                  Police Station: -<br>
                  District: -</p>
      </td>
      <td>
        To
        <span id="stamp">stamp</span>
        <p id="toadd">Name: -<br>
                  Village: -<br>
                  Post - office: -<br>
                  Police Station: -<br>
                  District: -</p>
      </td>
    </tr>
  </table>`
)
