//===----------------------------------------------------------------------===//
//
// Part of the LLVM Project, under the Apache License v2.0 with LLVM Exceptions.
// See https://llvm.org/LICENSE.txt for license information.
// SPDX-License-Identifier: Apache-2.0 WITH LLVM-exception
//
//===----------------------------------------------------------------------===//

// UNSUPPORTED: c++03, c++11

// <propagate_const>

// template <class U> propagate_const(U&&);

#include <experimental/propagate_const>
#include "test_macros.h"
#include "propagate_const_helpers.h"
#include <type_traits>

using std::experimental::propagate_const;

typedef propagate_const<ExplicitX> P;

int main(int, char**) {
  static_assert(!std::is_convertible<P, int>::value, "");
  static_assert(std::is_constructible<P, int>::value, "");

  return 0;
}
