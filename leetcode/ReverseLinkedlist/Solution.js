/*
Set following equal to following.next
Set current.next equal to previous
Set previous equal to current
Set current equal to following
*/

function reverse(head) {
// Step 1
  let previous = null
  let current = head
  let following = head
// Step 2
  while(current !== null) {
    following = following.next
    current.next = previous
    previous = current          
    current = following         // <===== 2d
  }
}
