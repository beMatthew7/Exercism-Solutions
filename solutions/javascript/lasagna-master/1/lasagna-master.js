/// <reference path="./global.d.ts" />
// @ts-check

/**
 * Implement the functions needed to solve the exercise here.
 * Do not forget to export them so they are available for the
 * tests. Here an example of the syntax as reminder:
 *
 * export function yourFunction(...) {
 *   ...
 * }
 */

export function cookingStatus(minutesLeft){
  if(minutesLeft  == 0){
    return 'Lasagna is done.';
  }
  else if(minutesLeft > 0){
    return 'Not done, please wait.';
  }
  else{
    return 'You forgot to set the timer.';
  }
}

export function preparationTime(layers, preparationTime = 2){
  return layers.length * preparationTime;
}


export function quantities(layers){
  const obj = {
    noodles: 0,
    sauce: 0
  }
  for(let i = 0; i < layers.length; i++){
    if(layers[i] == 'noodles'){
      obj['noodles'] += 50;
    } 
    if(layers[i] == 'sauce') {
      obj['sauce'] += 0.2;
    }
  }
  return obj;
}

export function addSecretIngredient(friendsList, myList){
  myList.push(friendsList[friendsList.length - 1]);
}

export function scaleRecipe(recipe, portions = 2){
  const new_recipe = {};
  for(const rec in recipe){
    new_recipe[rec] = recipe[rec] * (portions / 2);
  }
  return new_recipe;
}

