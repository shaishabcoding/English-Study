/* © Shaishab Chandra Shil 
 * Data: 17 Feb 2023
 * Time: 07:41 pm
 * Last-Modify: 21 Feb 2023 :: 10:37 pm
 * Url: https://www.facebook.com/shaishab316
 */

const id = e => document.getElementById(e);

const add = e => document.body.innerHTML += e;

window.onload = e => {
  var tem = "";
  var data = document.body.innerHTML.split("Shaishab");
  for (let i = 0; i < data.length; i++) {
    tem += (i != data.length - 1) ? ` ${data[i]} ${js.getRandomName()} ` : ` ${data[i]}`;
  }
  document.body.innerHTML = tem;
}
