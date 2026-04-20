// @ts-check

/**
 * Calculates the sum of the two input arrays.
 *
 * @param {number[]} array1
 * @param {number[]} array2
 * @returns {number} sum of the two arrays
 */
export function twoSum(array1, array2) {
  // Build numbers from digit arrays (handling leading zeros correctly)
  const n1 = Number(array1.join(''));
  const n2 = Number(array2.join(''));
  return n1 + n2;
}

export function luckyNumber(value) {
  // Convert to string, reverse and compare — simple and works for non-negative integers
  const s = String(value);
  const rev = s.split('').reverse().join('');
  return s === rev;
}

export function errorMessage(input) {
  if (input === '' || input === null || input === undefined) {
    return 'Required field';
  }

  // Prefer Number.isNaN to avoid false positives from coercion:
  const parsed = Number(input);
  if (Number.isNaN(parsed)) {
    return 'Must be a number besides 0';
  }

  // If the requirement "besides 0" means zero is invalid:
  if (parsed === 0) {
    return 'Must be a number besides 0';
  }

  return '';
}

