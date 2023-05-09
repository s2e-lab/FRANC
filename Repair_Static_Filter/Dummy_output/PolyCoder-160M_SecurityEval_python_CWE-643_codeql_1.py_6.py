
// RUN: %clang_cc1 -triple x86_64-apple-darwin10 -fsyntax-only -target x86_64-apple-darwin10 %s 2>&1 | FileCheck %s
#include <x86intrin.h>